package com.example.trading_app.service;

import com.example.trading_app.dto.TradeDTO;
import com.example.trading_app.entity.Trade;
import com.example.trading_app.repository.TradeRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TradeService {

    private final TradeRepository tradeRepository;

    public TradeService(TradeRepository tradeRepository) {
        this.tradeRepository = tradeRepository;
    }

    public List<TradeDTO> getAllTrades() {
        // Fetch entities from repository
        List<Trade> trades = tradeRepository.findAll();

        // Convert each entity to DTO
        return trades.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    private TradeDTO toDto(Trade trade) {
        TradeDTO dto = new TradeDTO();
        dto.setTradeId(trade.getTradeId());
        dto.setAccountNumber(trade.getAccountNumber());
        dto.setSymbol(trade.getSymbol());
        dto.setTradeDate(trade.getTradeDate());
        dto.setActivity(trade.getActivity());
        dto.setQuantity(trade.getQuantity());
        dto.setPrice(trade.getPrice());
        dto.setAmount(trade.getAmount());
        return dto;
    }
}
