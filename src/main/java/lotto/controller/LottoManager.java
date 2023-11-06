package lotto.controller;

import java.util.List;
import java.util.stream.IntStream;
import lotto.domain.Ticket;
import lotto.service.TicketService;
import lotto.view.InputView;
import lotto.view.OutputView;

public class LottoManager {

    private final TicketService ticketService;

    public LottoManager(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public void run() {
        purchaseTickets(InputView.purchaseAmount());
        winningTiket(InputView.winningNumbers());
    }

    private void winningTiket(String numbers) {
        ticketService.announcementNumber(numbers);
    }

    private void purchaseTickets(String money) {
        int ticketCnt = ticketService.purchaseAmount(money);
        List<Ticket> tickets = IntStream.range(0, ticketCnt)
                .mapToObj(ticket -> ticketService.automaticPurchase())
                .toList();
        OutputView.displayTicket(tickets);
    }

}
