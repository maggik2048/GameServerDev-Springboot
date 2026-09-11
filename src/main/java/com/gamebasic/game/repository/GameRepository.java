package com.gamebasic.game.repository;

import com.gamebasic.game.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {

    // ✅ Lv 7: 게임 목록을 id 내림차순으로 조회
    List<Game> findAllByOrderByIdDesc();
}