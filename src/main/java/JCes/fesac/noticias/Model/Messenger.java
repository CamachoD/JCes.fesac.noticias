package JCes.fesac.noticias.Model;

import java.util.*;

import javax.persistence.*;
import org.hibernate.annotations.ManyToAny;



@Entity
public class Messenger {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String messenger;
	@ManyToAny(metaColumn = @Column)
    @JoinColumn(columnDefinition="name")
	User use;
	List<Commentary> comentarios = new List<Commentary>() {
		
		@Override
		public <T> T[] toArray(T[] arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Object[] toArray() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public List<Commentary> subList(int arg0, int arg1) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public Commentary set(int arg0, Commentary arg1) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean retainAll(Collection<?> arg0) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean removeAll(Collection<?> arg0) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public Commentary remove(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean remove(Object arg0) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public ListIterator<Commentary> listIterator(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ListIterator<Commentary> listIterator() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public int lastIndexOf(Object arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public Iterator<Commentary> iterator() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public int indexOf(Object arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public Commentary get(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean containsAll(Collection<?> arg0) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean contains(Object arg0) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public boolean addAll(int arg0, Collection<? extends Commentary> arg1) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean addAll(Collection<? extends Commentary> arg0) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public void add(int arg0, Commentary arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public boolean add(Commentary arg0) {
			// TODO Auto-generated method stub
			return false;
		}
	};

}
