package com.livestock.service;

import com.livestock.model.Livestock;
import com.livestock.repository.LivestockRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivestockService {

    private final LivestockRepository repo;

    public LivestockService(LivestockRepository repo) {
        this.repo = repo;
    }

    public List<Livestock> getAll() {
        return repo.findAll();
    }

    public Livestock add(Livestock l) {
        return repo.save(l);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
