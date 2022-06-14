package com.ezen.biz.board;

import java.util.List;

import com.ezen.biz.dto.RoomVO;

public interface BoardService {

	void insertBoard(RoomVO board);

	void updateBoard(RoomVO board);

	void deleteBoard(RoomVO board);

	List<RoomVO> getBoardList();

	RoomVO getBoard(RoomVO board);

}