package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api")
public class MockController {

    @GetMapping("/test")
    public ResponseEntity<String> getMockResponse() {
        return ResponseEntity.ok("Mock response with mTLS enabled");
    }

    @PostMapping("/Create")
    public ResponseEntity<String> postDrugs() {
        return ResponseEntity.ok("{ \"status\": \"success\"," +
                "\"message\": \"Medication Received\" , \"resourceType\": \"Bundle\" }");
    }
}