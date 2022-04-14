package com.appletArray1;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Array1 extends Frame {
	int[] x;
	int[] y;
	int i;
	public Array1() {
		x = new int[7];
		y = new int[7];
		for(int i=0; i<x.length; i++) {
			x[i] = (int)(400*Math.random());
			y[i] = (int)(400*Math.random());
			
		}
		
		addWindowListener((WindowListener) new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		setSize(500,500);
		setVisible(true);
		}
	
	public void paint(Graphics g) {
	
		g.drawPolygon(x,y, 5);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Array1();

	}

}
