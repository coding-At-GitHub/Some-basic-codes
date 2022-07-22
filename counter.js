    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>counter</title>
    </head>
    <body>
        <div class="">
            <h1>Counter</h1>
            <p><span id="counter">0</span></p>
            <button id="button-start">Start</button>
            <button id="button-stop">Stop</button>
        </div>

        <script>
            window.onload = function (){
                var counter =0;
                var Interval;
                var appendCounter = document.getElementById("counter");
                var buttonStart = document.getElementById('button-start');
                var buttonStop = document.getElementById('button-stop');
                
                buttonStart.onclick = function(){
                    clearInterval(Interval);
                    Interval = setInterval(startCounter,1000);
                }
                buttonStop.onclick = function(){
                    clearInterval(Interval);
                }

                function startCounter(){
                    counter++;
                    console.log("counter");
                    appendCounter.innerHTML = counter;
                }

            }
        </script>
    </body>
    </html>
