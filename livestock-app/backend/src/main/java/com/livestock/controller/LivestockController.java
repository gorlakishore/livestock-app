package com.livestock.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/livestock")
public class LivestockController {

    @GetMapping
    public List<String> getAll() {
        return Arrays.asList("Goat - ₹5000", "Sheep - ₹7000");
    }
}
