package com.example.blueSmith.board.controller;

import com.example.blueSmith.board.dto.BoardDto;
import com.example.blueSmith.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.HashAttributeSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class BoardController {

    final BoardService boardService;

    @GetMapping("/allList")
    public List<BoardDto> allList() { // 게시판 글 전체목록 가져오기 테스트
        List<BoardDto> result = boardService.getBoardList();
        return result;
    }

    @PostMapping("/write")
    public void write(@RequestBody Map<String, Object> map) {
        Map<String, Object> result = map;
        int answer = boardService.insertBoard(map);
        System.out.println(answer);
    }

//    @GetMapping("/search")
//    public void search() {
//
//    }

}
