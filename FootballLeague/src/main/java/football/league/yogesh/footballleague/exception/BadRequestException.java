package football.league.yogesh.footballleague.exception;

public class BadRequestException extends RuntimeException {

  public BadRequestException(String ex) {
    super(ex);
  }

  public BadRequestException() {
  }
}
