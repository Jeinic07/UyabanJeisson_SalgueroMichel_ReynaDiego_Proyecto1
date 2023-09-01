package co.edu.unbosque.util;

public class DNode<E> {

	private DNode<E> next;
	private DNode<E> previus;
	private E info;

	public DNode() {

	}

	public DNode(E info) {
		this(null, null, info);

	}

	public DNode(DNode<E> next, DNode<E> previus, E info) {
		super();
		this.next = next;
		this.previus = previus;
		this.info = info;
	}

	public DNode<E> getNext() {
		return next;
	}

	public void setNext(DNode<E> next) {
		this.next = next;
	}

	public DNode<E> getPrevius() {
		return previus;
	}

	public void setPrevius(DNode<E> previus) {
		this.previus = previus;
	}

	public E getInfo() {
		return info;
	}

	public void setInfo(E info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "DNode [next=" + next + ", previus=" + previus + ", info=" + info + "]";
	}

	
}
