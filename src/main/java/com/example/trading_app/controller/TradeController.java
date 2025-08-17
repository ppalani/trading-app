package com.example.trading_app.controller;

import com.example.trading_app.dto.TradeDTO;
import com.example.trading_app.service.TradeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import java.util.List;

// Use @Controller if you want both HTML and JSON in same class
@Controller
public class TradeController {

    private final TradeService tradeService;

    public TradeController(TradeService tradeService) {
        this.tradeService = tradeService;
    }

    // HTML view endpoint
    @GetMapping("/trades")
    public String showTrades(Model model) {
        model.addAttribute("trades", tradeService.getAllTrades());
        return "trades"; // maps to trades.html template
    }

    // JSON endpoint

    @GetMapping(value = "/api/trades", produces = "application/json")
    @ResponseBody
    public List<TradeDTO> getTradesJson() {
        return tradeService.getAllTrades();
    }
}



