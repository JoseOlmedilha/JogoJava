package meujogo.modelo;

import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Player {
	
	private int x, y;
	private int dx,dy;
	private Image imagem;
	private int altura, largura;
	private List <Tiro> tiros;
	private boolean isVisivel;
	
	public Player() {
		this.x = 100;
		this.y = 100; 
		isVisivel = true;
		tiros = new ArrayList<Tiro>();
	}
	

	public void load() {
		ImageIcon referencia = new ImageIcon("res\\Tartaruga21.png");
		imagem = referencia.getImage();
		
		altura = imagem.getHeight(null);
		largura = imagem.getWidth(null);
		
	}
	
	public void update() {
		x += dx;
		y += dy;
	}
	
	public void tiroSimples() {
		this.tiros.add(new Tiro(x+largura, y + (altura/2)));
		
	}
	
	public Rectangle getBounds() {
		return new Rectangle (x,y,largura,altura);
	}
	
	
	public void keyPressed(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();
		
		if (codigo == KeyEvent.VK_C) {
			tiroSimples();
		}
		
		if (codigo == KeyEvent.VK_W) {
			dy = -3;
		}
		
		if (codigo == KeyEvent.VK_S) {
			dy = 3;
		}
		
		if (codigo == KeyEvent.VK_A) {
			dx = -3;
		}
		
		if (codigo == KeyEvent.VK_D) {
			dx = 3;
		}
	}
	
	public void keyRelease(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();
		
		if (codigo == KeyEvent.VK_W) {
			dy = 0;
		}
		
		if (codigo == KeyEvent.VK_S) {
			dy = 0;
		}
		
		if (codigo == KeyEvent.VK_A) {
			dx = 0;
		}
		
		if (codigo == KeyEvent.VK_D) {
			dx = 0;
		}
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Image getImagem() {
		return imagem;
	}

	public List<Tiro> getTiros() {
		return tiros;
	}
	public boolean isVisivel() {
		return isVisivel;
	}

	public void setVisivel(boolean isVisivel) {
		this.isVisivel = isVisivel;
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
}
