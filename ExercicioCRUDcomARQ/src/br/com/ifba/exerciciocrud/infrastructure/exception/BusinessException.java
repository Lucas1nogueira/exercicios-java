package br.com.ifba.exerciciocrud.infrastructure.exception;

public class BusinessException extends RuntimeException {

    // Exceções em regras de negócios
    
    private static final long serialVersionUID = -6062815084191991722L;

    public BusinessException() {
        super();
    }

    public BusinessException(final String message) {
        super(message);
    }

    public BusinessException(final Throwable cause) {
        super(cause);
    }

    public BusinessException(final String message, final Throwable cause) {
        super(message, cause);
    }

}
