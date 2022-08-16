package beum.kand.theatre.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Role {
private String id;
private String roleName;
private String description;
private String text;
private LocalDateTime createdAt;
private LocalDateTime updateAt;

    public Role() {
    }

    public Role(String id, String roleName, String description, String text) {
        this.id = id;
        this.roleName = roleName;
        this.description = description;
        this.text = text;
    }

    public Role(String id, String roleName, String description, String text, LocalDateTime createdAt, LocalDateTime updateAt) {
        this.id = id;
        this.roleName = roleName;
        this.description = description;
        this.text = text;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Role)) return false;
        Role role = (Role) o;
        return id.equals(role.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Role{" +
                "id='" + id + '\'' +
                ", roleName='" + roleName + '\'' +
                ", description='" + description + '\'' +
                ", text='" + text + '\'' +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }
}
