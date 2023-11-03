package bj.highfive.springbootdemo;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Album {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
        private String ref;
        private String name;
        private String title;
        private String description;
        private int duration;
        private String status;
        private String url;
        private List<String> tags;
        private String like;

        public Album(String id, String ref, String name, String title, String description, int duration, String status,
                String url, List<String> tags, String like) {
          
            this.ref = ref;
            this.name = name;
            this.title = title;
            this.description = description;
            this.duration = duration;
            this.status = status;
            this.url = url;
            this.tags = tags;
            this.like = like;
        }
        public Album(String string, String string2, String string3, String string4, String string5, int i, boolean b) {
        }
     
        public String getRef() {
            return ref;
        }
        public void setRef(String ref) {
            this.ref = ref;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public String getDescription() {
            return description;
        }
        public void setDescription(String description) {
            this.description = description;
        }
        public int getDuration() {
            return duration;
        }
        public void setDuration(int duration) {
            this.duration = duration;
        }
        public String getStatus() {
            return status;
        }
        public void setStatus(String status) {
            this.status = status;
        }
        public String getUrl() {
            return url;
        }
        public void setUrl(String url) {
            this.url = url;
        }
        public List<String> getTags() {
            return tags;
        }
        public void setTags(List<String> tags) {
            this.tags = tags;
        }
        public String getLike() {
            return like;
        }
        public void setLike(String like) {
            this.like = like;
        }

        @Override
        public boolean equals(Object obj ){
            if (this ==obj){
                return true;
            }
            if (! (obj instanceof Album)) {
                return false;
            }
            Album o = (Album) obj;
            return Objects.equals(this.name, o.name ) && Objects.equals(this.title, o.title)&& Objects.equals(this.title, o.title);
         }
         @Override
         public int hashCode() {
            return Objects.hash(this.id, this.name, this.title);
         }
        @Override
        public String toString (){
            return "Album { " + "id: " + this.id + ",  name:" + this.name + " }";
         }
    }