package com.sist.music;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MusicList extends JFrame implements ActionListener {
	JTable table;
	DefaultTableModel model;
	JButton b1, b2;
	Music music = new MelonMusic();
	public MusicList() {
		b1 = new JButton("지니뮤직");
		b2 = new JButton("멜론");
		JPanel p = new JPanel();
		p.add(b1);
		p.add(b2);
		add("North", p);
		String[] col = {"순위", "곡명", "가수명", "앨범"};
		String[][] row = new String[0][4];
		model = new DefaultTableModel(row, col);
		table = new JTable(model);
		table.getTableHeader().setReorderingAllowed(false);
		table.setRowHeight(35);
		JScrollPane js = new JScrollPane(table); 
		
		// 윈도우에첨부
		add("Center", js);
		setSize(800, 600);
		setVisible(true);
		
		print();
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void print() {
		
		for(int i=model.getRowCount()-1; i>=0; i--) {
			model.removeRow(i);
		}
		
		MusicVO[] m = music.musicListData();
		for(MusicVO vo : m) {
			String[] data = {
				String.valueOf(vo.getRank()), 
				vo.getTitle(),
				vo.getSinger(),
				vo.getAlbum()
			};
			model.addRow(data);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MusicList();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == b1) {
			music = new GenieMusic();
			print();
		}
		
		if(e.getSource() == b2) {
			music = new MelonMusic();
			print();
		}
	}

}
