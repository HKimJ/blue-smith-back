package com.example.blueSmith.board.controller;

import com.example.blueSmith.board.dto.BoardDto;
import com.example.blueSmith.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class BoardController {

    final BoardService boardService;

    @GetMapping("/allList")
    public String allList() { // 게시판 글 전체목록 가져오기 테스트
        String result = boardService.getBoardList();
        return result;
    }

    @PostMapping("/writing")
    public void write(@RequestBody Map<String, Object> map) {

    }

    @GetMapping("/search")
    public void search() {

    }

}
