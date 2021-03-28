import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Initials extends JPanel{
	private static ArrayList<Point> controlPoints = new ArrayList<Point>();
	private final int NUMBER_SEG = 1;
	public final int pointCount = 4;
	public Point[] points;// = getPoints(pointCount);
	
	public Initials() {
		JFrame jf = new JFrame("Кривые Безье");
		jf.setSize(800, 800);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.getContentPane().add(this);
		jf.setVisible(true);
  
  	}
	
	// что рисовать на панели
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // очистка экрана
		g.setColor(Color.green.darker());
		drawInitials(g);
	}

	// Рисует инициалы
	private void drawInitials(Graphics g) {
		setControlPointA1();
		drawScence(g);
		setControlPointA2();
		drawScence(g);
		setControlPointS();
		drawScence(g);
		setControlPointW();
		drawScence(g);
	}
	
	// Прорисовка одной буквы
	private void drawScence(Graphics g) {
		g.setColor(Color.green.darker());
        
        int NUMBER_SEG = controlPoints.size() / 3;
        
        for(int j=0;j<NUMBER_SEG;j++ ) {
        	points = getPoints(j);
            bezierGoGo(points, g);
        }
    };
    
    //Прорисовка одного сегмента кривой по четырем контрольным точкам
    private void bezierGoGo(Point[] sourcePoints, Graphics g){
        // ф-ия расчитывает финальный набор точек, по которым будет строится кривуля, а затем рисует ее
        ArrayList<Point> finalPoints = new ArrayList<>();
 
        for (float t=0; t<=1; t += 0.01)
            finalPoints.add(calculateBezierPoint(t, sourcePoints));
        
        drawCurve(finalPoints, g);
    }
   
    // Прорисовка маленьких отрезочков
    private void drawCurve(ArrayList<Point> finalPoints, Graphics g){
        for (int i = 1; i < finalPoints.size(); i++)
        {
            int x1 = (int)(finalPoints.get(i-1).getX());
            int y1 = (int)(finalPoints.get(i-1).getY());
            int x2 = (int)(finalPoints.get(i).getX());
            int y2 = (int)(finalPoints.get(i).getY());
            g.drawLine(x1, y1, x2, y2);
        }
    }
    
    // Извлечение из массива контрольных точек 4-х точек для одного сегмента
    private  Point[] getPoints(int index) {
    	int n = index * 3;
    	//setControlPoint();
        Point[] points = new Point[pointCount];
        for(int i=n;i<n+pointCount;i++) {
            points[i-n] = controlPoints.get(i);
            points[i-n] = controlPoints.get(i);
         }
        return points;
    }
    
    // Заполнение массива контрольных точек
     public void setControlPointA1() {
    	controlPoints.clear();
    	controlPoints.add(new Point(116, 63));
    	controlPoints.add(new Point(94, 64));
    	controlPoints.add(new Point(18, 265));
    	controlPoints.add(new Point(38, 276));
    	
    	controlPoints.add(new Point(51, 283));
    	controlPoints.add(new Point(98, 220));
    	controlPoints.add(new Point(114, 220));
    	
    	controlPoints.add(new Point(129, 220));
    	controlPoints.add(new Point(179, 286)); 
    	controlPoints.add(new Point(193, 280));
    	
    	controlPoints.add(new Point(212, 272));
    	controlPoints.add(new Point(138, 64));
    	controlPoints.add(new Point(116, 63)); 
    }
    
    public void setControlPointA2() {
	    controlPoints.clear();
	    controlPoints.add(new Point(115, 123));
	    controlPoints.add(new Point(136, 120));
	    controlPoints.add(new Point(144, 185));
	    controlPoints.add(new Point(114, 185));
	    
	    controlPoints.add(new Point(86, 184));
	    controlPoints.add(new Point(94, 121));
	    controlPoints.add(new Point(113, 123));
    }
    
    public void setControlPointS() {
	    controlPoints.clear();
	    controlPoints.add(new Point(354, 98));
	    controlPoints.add(new Point(340, 92));
	    controlPoints.add(new Point(350, 83));
	    controlPoints.add(new Point(326, 81));
	    
	    controlPoints.add(new Point(311, 80));
	    controlPoints.add(new Point(308, 81));
	    controlPoints.add(new Point(293, 97));
	    
	    controlPoints.add(new Point(283, 108));
	    controlPoints.add(new Point(284, 124));
	    controlPoints.add(new Point(284, 141));
	    
	    controlPoints.add(new Point(289, 155));
	    controlPoints.add(new Point(289, 151));
	    controlPoints.add(new Point(304, 159));
	    
	    controlPoints.add(new Point(317, 166));
	    controlPoints.add(new Point(324, 162));
	    controlPoints.add(new Point(346, 175));
	    
	    controlPoints.add(new Point(359, 183));
	    controlPoints.add(new Point(375, 206));
	    controlPoints.add(new Point(367, 241));
	    
	    controlPoints.add(new Point(364, 256));
	    controlPoints.add(new Point(364, 255));
	    controlPoints.add(new Point(348, 272));
	    
	    controlPoints.add(new Point(338, 283));
	    controlPoints.add(new Point(310, 287));
	    controlPoints.add(new Point(295, 287));
	    
	    controlPoints.add(new Point(269, 287));
	    controlPoints.add(new Point(244, 271));
	    controlPoints.add(new Point(233, 260));
	    
	    controlPoints.add(new Point(221, 248));
	    controlPoints.add(new Point(211, 215));
	    controlPoints.add(new Point(230, 213));
	    
	    controlPoints.add(new Point(245, 211));
	    controlPoints.add(new Point(252, 234));
	    controlPoints.add(new Point(270, 239));
	    
	    controlPoints.add(new Point(287, 247));
	    controlPoints.add(new Point(286, 250));
	    controlPoints.add(new Point(315, 249));
	    
	    controlPoints.add(new Point(330, 248));
	    controlPoints.add(new Point(342, 217));
	    controlPoints.add(new Point(328, 208));
	    
	    controlPoints.add(new Point(300, 190));
	    controlPoints.add(new Point(283, 191));
	    controlPoints.add(new Point(268, 180));
	    
	    controlPoints.add(new Point(258, 173));
	    controlPoints.add(new Point(251, 160));
	    controlPoints.add(new Point(247, 138));
	    
	    controlPoints.add(new Point(248, 122));
	    controlPoints.add(new Point(247, 109));
	    controlPoints.add(new Point(258, 90));
	    
	    controlPoints.add(new Point(267, 74));
	    controlPoints.add(new Point(278, 61));
	    controlPoints.add(new Point(293, 55));
	    
	    controlPoints.add(new Point(308, 49));
	    controlPoints.add(new Point(316, 49));
	    controlPoints.add(new Point(334, 52));
	    
	    controlPoints.add(new Point(348, 54));
	    controlPoints.add(new Point(357, 61));
	    controlPoints.add(new Point(366, 67));
	    
	    controlPoints.add(new Point(373, 72));
	    controlPoints.add(new Point(385, 97));
	    controlPoints.add(new Point(353, 98));

	    }

    public void setControlPointW() {
	    controlPoints.clear();
	    controlPoints.add(new Point(47, 348));
	    controlPoints.add(new Point(39, 328));
	    controlPoints.add(new Point(353, 326));
	    controlPoints.add(new Point(358, 348));
	    
	    controlPoints.add(new Point(361, 363));
	    controlPoints.add(new Point(88, 352));
	    controlPoints.add(new Point(99, 386));
	    
	    controlPoints.add(new Point(104, 400));
	    controlPoints.add(new Point(286, 380));
	    controlPoints.add(new Point(293, 401));
	    
	    controlPoints.add(new Point(298, 415));
	    controlPoints.add(new Point(154, 408));
	    controlPoints.add(new Point(162, 425));
	    
	    controlPoints.add(new Point(168, 439));
	    controlPoints.add(new Point(254, 426));
	    controlPoints.add(new Point(254, 447));
	    
	    controlPoints.add(new Point(254, 457));
	    controlPoints.add(new Point(189, 462));
	    controlPoints.add(new Point(204, 462)); 
    }
   
	// Вычисление точек кривой Безье
	private Point calculateBezierPoint(float t, Point[] points) {
		float u = 1 - t;
		float tt = t * t;
		float uu = u * u;
		float uuu = uu * u;
		float ttt = tt * t;
		double sumX = 0;
       double sumY = 0;
		
       sumX += uuu * points[0].x;
       sumX += 3 * uu * t * points[1].x;
       sumX += 3 * u * tt * points[2].x;
       sumX += ttt * points[3].x;
       
       sumY += uuu * points[0].y;
       sumY += 3 * uu * t * points[1].y;
       sumY += 3 * u * tt * points[2].y;
       sumY += ttt * points[3].y;
       
		Point p = new Point();
		p.x=(int) Math.round(sumX);
        p.y=(int) Math.round(sumY);
       
       return p;
		
	}

	public static void main(String[] args) {
		Initials sk = new Initials();
		sk.repaint(); // перерисовка jframe
	}
}	

