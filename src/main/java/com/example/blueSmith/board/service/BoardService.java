package com.example.blueSmith.board.service;

import com.example.blueSmith.board.dto.BoardDto;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface BoardService {

    public List<BoardDto> getBoardList(); // 게시글 전체 목록
    public int insertBoard(@RequestBody Map<String, Object> map); // 글쓰기
//    public void modifyBoard(); // 수정
//    public void removeBoard(); // 삭제

//    public BoardDto searchBoard(int boardNum); // 검색기능

}
