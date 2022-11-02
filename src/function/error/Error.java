package function.error;


//이런 에러 이넘을 사용하기 보다는
//Exception을 사용하는 것이 덜 의존적이다.
public enum Error {
    OK,
    INVALID,
    NO_SUCH,
    LOCKED,
    OUT_OF_RESOURCES,
    WAITING_FOR_EVENT;
}
