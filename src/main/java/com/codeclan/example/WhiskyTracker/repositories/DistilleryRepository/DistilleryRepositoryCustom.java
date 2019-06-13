package com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface DistilleryRepositoryCustom {

    List<Distillery> getDistilleriesFromRegion(String region);
    List<Distillery> distilleriesWithWhiskiesOfAge(int age);
}
