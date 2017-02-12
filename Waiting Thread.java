//Below Code is to update UI with every 10 seconds
//First declare one global varialbe for Handler to update the UI control from Thread, like below
public Static final int waitingTime = 10000;

Handler mHandler = new Handler();

//Now create one Thread and use while loop to periodically perform the task using the sleep method of the thread.

 new Thread(new Runnable() {
        @Override
        public void run() {
            // TODO Auto-generated method stub
            while (true) {
                try {
                    Thread.sleep(waitingTime); //Sleep for 10 seconds
                    mHandler.post(new Runnable() {

                        @Override
                        public void run() {
                            // TODO Auto-generated method stub
                            // Write your code here to update the UI.
                        }
                    });
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        }
    }).start();
