package br.ufpb.dcx.eduardo;

public class RoupaJaExisteException extends RuntimeException {
    public RoupaJaExisteException(String message) {

        super(message);
    }

    public RoupaJaExisteException(){
        super();
    }
}
