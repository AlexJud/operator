package com.call.center.operator.controllers;

import com.call.center.operator.models.Call;
import com.call.center.operator.repositories.CallRepository;
import com.call.center.operator.repositories.PatientRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@Log4j2
@RestController
public class CallController {

    @Autowired
    private CallRepository callRepository;

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity noValue(Exception ex){
        return ResponseEntity.badRequest().body(ex.getMessage());
    }


    @GetMapping("/api/call")
    public ResponseEntity getAll() {
        log.info("Request GET to: /api/call");
        return ResponseEntity.ok(callRepository.findAll());
    }

    @GetMapping("/api/call/{id}")
    public ResponseEntity getById(@PathVariable Integer id){
        log.info("Request GET to: /api/call/{id} "+ id);
        return ResponseEntity.ok(callRepository.findById(id).orElseThrow());
    }

    @PostMapping("/api/call")
    public ResponseEntity saveCall(@RequestBody Call call){
        log.info("Request POST to: /api/call/ "+ call);
        return ResponseEntity.ok(callRepository.save(call));
    }
}
