# Annotations

## 📦 JPA / Hibernate Entity Annotations (Quick Reference)

### 🔹 Core Mapping

@Entity → Marks class as JPA entity (mapped to table)
@Table(name="...") → Specifies table name and indexes

---

### 🔹 Primary Key

* @Id → Defines primary key field
* @GeneratedValue(strategy=...) → Auto-generates ID
* @SequenceGenerator → Defines sequence for ID generation

---

### 🔹 Column Mapping

@Column → Maps field to DB column

@Column attributes:

* name → Column name in DB (if different from field name)
* nullable → Whether column can store NULL (false = NOT NULL)
* unique → Ensures all values are unique
* length → Max length (used for VARCHAR)
* updatable → Whether column can be updated after insert
* insertable → Whether column is included in INSERT query

@Transient → Field NOT persisted in DB

---

### 🔹 Relationships

* @OneToOne → One-to-one relationship
* @OneToMany → One-to-many relationship
* @ManyToOne → Many-to-one relationship (most common)
* @ManyToMany → Many-to-many relationship
* @JoinColumn → Defines foreign key column
* @JoinTable → Defines join table for many-to-many

---

### 🔹 Fetch Strategy

* FetchType.LAZY → Load data only when needed
* FetchType.EAGER → Load immediately

---

### 🔹 Cascade Operations

* CascadeType.PERSIST → Save child with parent
* CascadeType.MERGE → Update child with parent
* CascadeType.REMOVE → Delete child with parent
* CascadeType.ALL → Apply all operations

---

### 🔹 Enum Handling

* @Enumerated(EnumType.STRING) → Store enum as string
* @Enumerated(EnumType.ORDINAL) → Store enum as number (avoid)

---

### 🔹 Audit / Timestamp

* @CreationTimestamp → Auto set creation time
* @UpdateTimestamp → Auto update modification time

---

### 🔹 Concurrency Control

@Version → Enables optimistic locking (prevents concurrent update issues)

---

### 🔹 Embedded Objects

* @Embeddable → Marks class as embeddable
* @Embedded → Includes embedded object in entity

---

### 🔹 Indexing

@Index → Creates DB index for performance (used inside @Table)

---

### 🔹 Inheritance (Advanced)

* @Inheritance → Defines inheritance strategy
* @DiscriminatorColumn → Column to differentiate entity types

---

### 🔹 Validation (Optional, not preferred in Entity)

* @NotNull → Field cannot be null
* @Size → Field size constraint
* @NotBlank → Non-empty string

---

## ✅ Minimal Set for Most Projects

* @Entity
* @Id
* @GeneratedValue
* @Column
* @ManyToOne
* @OneToMany
* @Enumerated
* @CreationTimestamp
* @UpdateTimestamp
* @Version
