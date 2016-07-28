package lin;

public class Student {
	
		private int javaScore;
		private int sqlScore;
		private int cScore;
		private int getJavaScore() {
			return javaScore;
		}
		private void setJavaScore(int javaScore) {
			this.javaScore = javaScore;
		}
		private int getSqlScore() {
			return sqlScore;
		}
		private void setSqlScore(int sqlScore) {
			this.sqlScore = sqlScore;
		}
		private int getcScore() {
			return cScore;
		}
		private void setcScore(int cScore) {
			this.cScore = cScore;
		}
		public Student(){
			
		}
		public Student(int javaScore,int sqlScore,int cScore){
			this.javaScore=javaScore;
			this.sqlScore=sqlScore;
			this.cScore=cScore;
			
		}
		public void getMax() {
			int max=javaScore;
			if (sqlScore>=max) {
				max=sqlScore;
				
			}
			if (cScore>=max) {
				max=cScore;
			}
			System.out.println("最高分数是："+max);
			
		}
		public  void getMin() {
			int min=javaScore;
			if (sqlScore<=min) {
				min=sqlScore;
			}
			if (cScore<=min) {
				min=cScore;
			}
		System.out.println("最低分是："+min);
		}
		
		public void getSum() {
			int s=0;
			s=javaScore+sqlScore+cScore;
			System.out.println("分数总和是："+s);
		}
		public void getAverage() {
			int ave=0;
			ave=(javaScore+sqlScore+cScore)/3;
			System.out.println("平均分分是："+ave);
		}

	}

