package entitiess;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "motivation_quotes", schema = "public")
public class MotivationEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "motivation_quote")
    private String MotivationQuote;

    @ManyToOne
    @JoinColumn(name = "created_by", referencedColumnName = "id")
    private UserEntity createdBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMotivationQuote() {
        return MotivationQuote;
    }

    public void setMotivationQuote(String motivationQuote) {
        MotivationQuote = motivationQuote;
    }

    public UserEntity getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserEntity createdBy) {
        this.createdBy = createdBy;
    }
}
