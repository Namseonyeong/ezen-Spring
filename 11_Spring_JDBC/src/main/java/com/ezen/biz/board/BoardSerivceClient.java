package com.ezen.biz.board;

import java.util.List;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.ezen.biz.dto.BoardVO;

/*
 * 	Ŭ���̾�Ʈ �ۼ� �� ����.
 */

public class BoardSerivceClient {

	public static void main(String[] args) {
		
		// 1. ������ �����̳� ����.
		AbstractApplicationContext container =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. BoardSerivceImpl ��ü Lookup
		BoardService boardService = (BoardService) container.getBean("boardService");
		
		// 3. �Խñ� ���.
		// 		BoardVO ��ü ����.
		// 		boardService�� insertBoard() ȣ��.
	for (int i=0; i<10; i++) {
			BoardVO board = new BoardVO();

			board.setTitle("�Խñ� ����" + i);
			board.setWriter("�ۼ���" + i);
			board.setContent("������ ���� �Խñ��Դϴ�.");
			
			boardService.insertBoard(board);
		}
		
		/* Ʈ����� ó�� ����
		BoardVO board = new BoardVO();
		board.setSeq(100);
		board.setTitle("�Խñ� ����");
		board.setWriter("�ۼ���");
		board.setContent("������ ���� �Խñ��Դϴ�.");
		
		boardService.insertBoard(board);
		*/
		
		// 4. �Խñ� ��ü ��� ���.
		List<BoardVO> boardList = boardService.getBoardList();
		for (BoardVO vo : boardList) {
			System.out.println(vo);
		}
		container.close();
	}

}
