package com.call.center.operator.repositories;

import com.call.center.operator.models.Call;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CallRepository extends JpaRepository<Call,Integer> {
}
