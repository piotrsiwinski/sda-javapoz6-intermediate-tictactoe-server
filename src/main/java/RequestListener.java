import pl.sda.poznan.Message;

/**
 * Interjest, ktorego zadaniem bedzie wysyalanie odpowiedniej wiadomosci na podstawie przyslanej
 * wiadomosci
 */
public interface RequestListener {

  Message onMessageReceived(Message request);
}
