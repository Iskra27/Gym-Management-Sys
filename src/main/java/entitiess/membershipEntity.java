package entitiess;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "Membership", schema = "public")
public class membershipEntity implements Serializable{

        private static final long serialVersionUID = 1L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false)
        private String membership;

        @Column(nullable = false)
        private Long count;

        @Column(nullable = false)
        private Long fee;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getMembership() {
            return membership;
        }

        public void setMembership(String membership) {
            this.membership = membership;
        }

        public Long getCount() {
            return count;
        }

        public void setCount(Long count) {
            this.count = count;
        }

        public Long getFee() {
            return fee;
        }

        public void setFee(Long fee) {
            this.fee = fee;
        }
    }


