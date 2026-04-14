package com.livestock.controller;

import com.livestock.model.Livestock;
import com.livestock.service.LivestockService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/livestock")
@CrossOrigin(origins = "*")
public class LivestockController {

    private final LivestockService service;

    public LivestockController(LivestockService service) {
        this.service = service;
    }

    @GetMapping
    public List<Livestock> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Livestock add(@RequestBody Livestock l) {
        return service.add(l);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
