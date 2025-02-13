package br.ufpb.dcx.eduardo;

public class RoupaInexistenteException extends RuntimeException {
    public RoupaInexistenteException(String message) {

        super(message);
    }
    public RoupaInexistenteException(){
        super();
    }
}
