# SILab2
1. Функција за пресметување време во секунди
3. Cyclimatic complexity:
 Бројот на ѐ Nodes=17 и Edges=23.
Cyclimatic complexity=E-N+2=23-17+2=8
Cyclimatic complexity= P+1=7+1=8
Cyclimatic complexity= R=8
Можеме да заклучиме дека цикломатичноста на графот изнесува 8.

4. Multiple Condition:
Имаме 7 јазли на одлочување.
	2 Node (i<timeslist())
True X	0,2	1,2=3
False X	2,2	1,2-4


5 Node (hr<0 || hr>24)
True X	Hr=-1	1 2 3  5 – 6
False True	Hr=26	1 2 3 5 - 6
False False	Hr=15	1 2 3 5 - 7


6 Nodee (hr<0)
True	Hr=-1	1 2 3 5 6 – 8
False	Hr=2	1 2 3 5 6 – 9


7 Node (hr < 24)
Tue 	Hr=15	1 2 3 5 7 -10
False	Hr=26	1 2 3 5 7 – 11

		
		

10 Node (min<0 || min> 59 )
True X	Min=-1	1 2 3 5 7 10 -12
False True	Min=60	1 2 3 5 7 10 – 12
False False 	Min=25	1 2 3 5 7 10 - 13


11 Node (hr==24 && min ==0 && sec ==0)
True True True	Hr=24 min=0 sec=0	1 2 3 5 7 11 - 16
True True False	Hr=24 min=0 sec=1	1 2 3 5 7 11 - 17
True False True	Hr=24 min=1 sec=0	1 2 3 5 7 11 - 17
False True True	Hr=23 min=0 sec=0	1 2 3 5 7 11 - 17
False X X	Hr=24 min=0 sec=1	1 2 3 5 7 11 - 17
X False X	Hr=24 min=1 sec=1	1 2 3 5 7 11 - 17
X X False	Hr=24 min=1 sec=1	1 2 3 5 7 11 - 17

13 Node (sec>=0 && sec<=50)
True True	Sec=10	1 2 3 5 7 10 13 – 14
True False	Infeasable	/
False X	Sec=60	1 2 3 5 7 10 13 - 15



5.  Every Branch:
	1	 2	3	4	5	6	7
1,2-3	X	x	x	x	x	x	
1,2-4							x
5-6	X		X				
5-7		x		X	x	X	
6-8	X						
6-9			x				
7-10		X		X	X		
7-11						X	
10-12		x					
10-13				X	X		
13-14				x			
14-15					X		
11-16						X	
11-17							

