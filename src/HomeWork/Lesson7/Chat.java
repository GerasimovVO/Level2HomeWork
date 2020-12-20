package HomeWork.Lesson7;

public interface Chat {
    void broadcastMessage(String message);
    void privateMsg (String message, String nickname);
    boolean isNicknameOccupied(String nickname);
    void subscribe(ClientHandler client);
    void unsubscribe(ClientHandler client);
    AuthenticationService getAuthenticationService();
}
