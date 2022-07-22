package com.example.blueSmith.board.service;

import com.example.blueSmith.board.dto.BoardDto;
import com.example.blueSmith.board.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    final private BoardMapper boardMapper;


    @Override
    public List<BoardDto> getBoardList() {
        List<BoardDto> allList = boardMapper.getBoardList();
        return allList;
    }

    @Override
    public int insertBoard(@RequestBody Map<String, Object> map) {
        int result = boardMapper.insertBoard();
        return result;
    }


}
