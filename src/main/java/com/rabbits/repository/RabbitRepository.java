package com.rabbits.repository;

import com.rabbits.domain.Rabbit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RabbitRepository extends JpaRepository<Rabbit, Long> {
}
