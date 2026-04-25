# 🤝 Contributing to Booking Engine Service

Thank you for contributing! Please follow the guidelines below to maintain code quality and consistency.

---

## 🔁 Repository Structure

* `main` → stable branch (protected)
* All development must happen via feature branches

---

## 🌿 Branch Naming Convention

Use the following pattern:

type/short-description

### Types:

* `feature/*` → new feature
* `fix/*` → bug fixes
* `refactor/*` → code improvements
* `chore/*` → setup/config changes
* `core/*` → foundational system changes

### Examples:

* feature/login
* fix/booking-overlap
* refactor/service-layer
* chore/project-setup
* core/exception-handling

---

## 🔄 Contribution Workflow

### Step 1: Fork the repository

### Step 2: Clone your fork

git clone <your-fork-url>

### Step 3: Add upstream (original repo)

git remote add upstream <main-repo-url>

### Step 4: Create a branch

git checkout -b feature/your-feature-name

---

## 🔁 Sync with Latest Changes

Before raising PR:

* git fetch upstream
* git checkout main
* git merge upstream/main
* git checkout feature/your-branch
* git rebase main
* git push --force

---

## 🔗 Pull Request Guidelines

* No direct push to `main`
* Always create a PR
* PR must include:

    * Description of changes
    * Reason for implementation
* Keep PRs small and focused
* At least one review required before merge

---

## ⚠️ Code Guidelines

* Follow layered architecture:
  Controller → Service → Repository
* Use meaningful naming
* Avoid hardcoded values
* Handle exceptions properly

---

## 🚨 Important Rules

* Do not commit directly to `main`
* Always sync with latest `main` before PR
* Resolve conflicts locally before pushing

---

## 🧠 Collaboration Principle

Clean code + clear process = scalable system
