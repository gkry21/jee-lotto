package com.lotto.web.domains;

import java.io.Serializable;

public class LottoBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
			private String lottoSeq, ball, lotteryNum;  //�������� 4�ڸ� ������, NO. 1~4/ �������� ����, ���� 1~45�� ������,�ߺ��� üũ 6�� �����Է�0,0,0,0,0 

			public String getLottoSeq() {
				return lottoSeq;
			}

			public void setLottoSeq(String lottoSeq) {
				this.lottoSeq = lottoSeq;
			}

			public String getBall() {
				return ball;
			}

			public void setBall(String ball) {
				this.ball = ball;
			}

			public String getLotteryNum() {
				return lotteryNum;
			}

			public void setLotteryNum(String lotteryNum) {
				this.lotteryNum = lotteryNum;
			}

			@Override
			public String toString() {
				return "LottoBean [�ζǹ�ȣ=" + lottoSeq 
												+ ", ����ȣ=" + ball 
												+ ", ��÷��ȣ=" + lotteryNum + "]";
			}
			
}
