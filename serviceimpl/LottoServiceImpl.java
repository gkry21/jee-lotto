package com.lotto.web.serviceimpl;

import java.util.Random;

import com.lotto.web.daoimpl.LottoDAOImpl;
import com.lotto.web.daos.LottoDao;
import com.lotto.web.domains.LottoBean;
import com.lotto.web.services.LottoService;

public class LottoServiceImpl implements LottoService{
private LottoDao dao;
		
		public LottoServiceImpl() {
				dao = new LottoDAOImpl();
		}
	@Override  //�������� 4�ڸ� ������, NO. 1~4/ �������� ����, ���� 1~45�� ������,�ߺ��� üũ 6�� �����Է�0,0,0,0,0 lottoSeq, ball, lotteryNum
	public void createLotto(LottoBean param) {
		param.setBall(createBall());
		param.setLotteryNum(createLottoNum());
		param.setLottoSeq(createLottoSeq());
		dao.insertLotto(param);
		}

	@Override
	public String createLottoSeq() {
		String seq = "No.";
		Random ran = new Random();
		for(int i =0;i<4;i++) {
			seq += ran.nextInt(10) +"";
		}
		System.out.println("��������:" +seq);
		return seq;
	}

	@Override
	public String createBall() {
		String ball = "";
		Random ran = new Random();
		ball =ran.nextInt(45)+1 +"" ;
		return ball;
	}

	@Override
	public String createLottoNum() {
		String lotteryNum = "";
		int[] arr = new int[6];
		int a =Integer.parseInt(createBall()) ;
		for(int i=0;i<6;i++) {
			if(duplicatePrevention(arr, a)) {
				arr[i] = a;
				break;
			}
			lotteryNum = String.valueOf(a);
		}System.out.println(lotteryNum);
		return lotteryNum;
	}
	
	@Override
	public boolean duplicatePrevention(int[] arr, int a) {
		boolean flag = false;
		for(int i=0;i<6;i++) {
			if(arr[i]==a) {
				flag = false;
				break;
			} else {flag = true; break;}
	}
		return flag; 
}
	@Override
	public String ascendingSort(int[] arr) {
		return null;
	}

}
