using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI; //for Text

public class PlayerController : MonoBehaviour {

    //class variables
    public float speed = 5f;
    Rigidbody rb; //reference to our rigidbody component
    int score = 0, win = 1000;//win = total needed
    public Text scoreText, timerText; //reference to Text object
    AudioSource aud; //refrence to AudioSource component
    public AudioClip pickupSound, winSound, loseSound;
    int time;
    bool canMove; //whether the player has control

	// Use this for initialization
	void Start () {
        rb = GetComponent<Rigidbody>(); //hook up the RB
        aud = GetComponent<AudioSource>(); //hook up aud

        time = 15;
        canMove = true;

        //update score text
        scoreText.text = ("Score: " + score);
        timerText.text = ("Time: " + time);

        //start the timer
        StartCoroutine(Countdown());
    }

    // Update is called once per frame
    void Update()
    {
        if (canMove)
        {
            //WASD movement
            //if the user is hitting a key, apply force
            // to the RB in that direction
            if (Input.GetKey(KeyCode.W)) //forward
            {
                rb.AddForce(new Vector3(0, 0, speed));
            }
            if (Input.GetKey(KeyCode.S)) //back
            {
                rb.AddForce(new Vector3(0, 0, -speed));
            }
            if (Input.GetKey(KeyCode.D)) //right
            {
                rb.AddForce(new Vector3(speed, 0, 0));
            }
            if (Input.GetKey(KeyCode.A)) //left
            {
                rb.AddForce(new Vector3(-speed, 0, 0));
            }
        }
    }

    //runs every time we hit a trigger
    void OnTriggerEnter(Collider other)
    {
        //if we hit a pickup & player has control
        if (other.tag == "Pickup" && canMove)
        {
            //destroy it
            Destroy(other.gameObject);

            //score a point
            score++;
            print("Score: " + score);
            //update score text
            scoreText.text = "Score: " + score;

            //play pickup sound
            aud.PlayOneShot(pickupSound);

            //if we win
            if (score >= win)
            {
                scoreText.text += "\t\tYOU WIN!";
                aud.PlayOneShot(winSound);
            }
        }
    }
    //coroutine to run the rimer
    IEnumerator Countdown()
    {
        //while there's time left 
        while (time > 0)
        {

            //wait one second, then tick down timer
            yield return new WaitForSeconds(1);
            if (score < win) //if if haven't won
            {
                time--;
                timerText.text = "Time: " + time;
            }

            //if time is up & haven't won, game over
            if (time <= 0 && score < win)
            {
                canMove = false; //take away control
                aud.PlayOneShot(loseSound); //play sound
                scoreText.text += "\tGAME OVER";
            }
        }
    }
}
