package pl.lotto.domain.numberreciever;

import pl.lotto.domain.numberreciever.dto.TicketDto;

class TicketMapper {
    public static TicketDto map(Ticket ticket) {
        return TicketDto.builder()
                .numbersFromUser(ticket.numbersFromUser())
                .ticketId(ticket.ticketId())
                .drawDate(ticket.drawDate())
                .build();
    }
}
