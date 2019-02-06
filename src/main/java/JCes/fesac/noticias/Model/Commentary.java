package JCes.fesac.noticias.Model;

import javax.persistence.*;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Commentary {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String comint;
	@ManyToAny(metaColumn = @Column)
    @JoinColumn(columnDefinition="name")
	User use;

}
