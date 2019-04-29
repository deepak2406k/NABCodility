1. This is Spring Boot Maven Java Application
2. It contains below modules
    Controller
    Service
    Repository - JPA Repositiry
    Exception
    DTO
    Entity
3. Controller contains various method
    Create Task
    Update Task
    Complete Task
    Find All Task
    Find Outstanding Task
4. Each method contains User role in request header.
5. If user role is not valid such as Normal user call create Task API then Application will throw Custom Exception i.e User Exception
    as BAD REQUEST.
