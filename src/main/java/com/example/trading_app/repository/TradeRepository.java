package com.example.trading_app.repository;

import com.example.trading_app.entity.Trade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TradeRepository extends JpaRepository<Trade, String> {

    // Optional: custom finder by symbol
    List<Trade> findBySymbol(String symbol);

    // Optional: custom finder by account number
    List<Trade> findByAccountNumber(String accountNumber);
}
