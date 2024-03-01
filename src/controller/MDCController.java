package controller;

public class MDCController {
	
	public MDCController () {
		super(); 
	}
	
	public int FuncaoMdc (int x, int y) {
            //MDC(x, x) = x
            if (x == y) {
                return x;
            }
            //MDC(x, y) = MDC(x - y, y), se x > y
            else if (x > y) {
                return FuncaoMdc(x - y, y);
            }
            //MDC(x, y) = MDC(y, x), se y > x
            else {
                return FuncaoMdc(y, x);
            }
	
	}

}
