package com.call.center.operator.controllers;

import com.call.center.operator.models.Call;
import com.call.center.operator.repositories.CallRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.NoSuchElementException;

@Log4j2
@RestController
public class CallController {

    private final CallRepository callRepository;

    public CallController(CallRepository callRepository) {
        this.callRepository = callRepository;
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity noValue(Exception ex){
        return ResponseEntity.badRequest().body(ex.getMessage());
    }


    @GetMapping("/api/call")
    public ResponseEntity getAll() {
//        log.info("Request GET to: /api/call");
        return ResponseEntity.ok(callRepository.findAll());
    }

    @GetMapping("/api/call/{id}")
    public ResponseEntity getById(@PathVariable Integer id){
//        log.info("Request GET to: /api/call/{id} "+ id);
        return ResponseEntity.ok(callRepository.findById(id).orElseThrow());
    }

    @PostMapping("/api/call")
    public ResponseEntity saveCall(@RequestBody @Valid Call call){
//        log.info("Request POST to: /api/call/ "+ call);
//        Call save = callRepository.save(call);
        return ResponseEntity.ok(callRepository.save(call));
    }
}
