//0610 �������̽��� ������ Ŭ����
package com.ezen.biz.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.biz.dao.BoardDAO;
import com.ezen.biz.dto.BoardVO;

//Serviceimlp�� Main���� ȣ���� �� �ְ� ��ü�� ��� / @Service
@Service("boardService")
public class BoardServiceimlp implements BoardService {


	
	//insert���� ����Ҽ��ְ� 
	@Autowired //������ ��ü��...? 
	private BoardDAO bDao;
	@Override
	public void insertBoard(BoardVO board) {
		bDao.insertBoard(board);
	}
	
	@Override
	public void updateBoard(BoardVO board) {
		bDao.updateBoard(board);
	}
	
	@Override
	public void daleteBoard(BoardVO board) {
		bDao.deleteBoard(board);
	}
	
	@Override
	public List<BoardVO> getBoardList() {
		
		//BoardVO Ÿ���� ���� boardList(����)�� �����ʰ� �ٷ� ȣ��
		return bDao.getBoardList();
	}
	
	@Override
	public BoardVO getBoard(BoardVO board) {
		
		return bDao.getBoard(board);
	}
	
	
}
