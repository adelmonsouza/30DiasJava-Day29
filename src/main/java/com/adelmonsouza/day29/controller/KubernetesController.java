package com.adelmonsouza.day29.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/kubernetes")
public class KubernetesController {

    @GetMapping
    public ResponseEntity<Map<String, String>> getInfo() {
        return ResponseEntity.ok(Map.of(
            "status", "success",
            "message", "Kubernetes endpoint - Day 29",
            "day", "29"
        ));
    }
}
