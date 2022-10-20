using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class WorldManager : MonoBehaviour {

    //min & max camera positions
    float minX, maxX, minZ, maxZ;
    float camSpeed = 10f;
    public GameObject ballPrefab;
    int zone1 = 0; int zone2 = 0;
    public Text countText, timeText;
    int time = 15;

	// Use this for initialization
	void Start () {

        Spawn();

        //initiallize count text
        countText.text = "Platform 1: " + zone1 +
            "\tPlatform 2: " + zone2;
        timeText.text = "Time: " + time;

        //start the timer
        StartCoroutine(Countdown());
        //start tracking for end game
        StartCoroutine(EndGame());
	}
	
	// Update is called once per frame
	void Update () {

        //if mouse is on one side of the screen,
        // move camera in that direction
        Vector3 mousePos = Camera.main.ScreenToViewportPoint
            (Input.mousePosition); //translate mousepos to 0-1

        //reference to main camera
        GameObject cam = GameObject.Find("Main Camera");

        if(mousePos.x < 0.1f) //left
        {
            cam.transform.position -= new Vector3(
                Time.deltaTime * camSpeed, 0);
        }
        if(mousePos.x > 0.9f) //right
        {
            cam.transform.position += new Vector3(
                Time.deltaTime * camSpeed, 0);
        }
        if(mousePos.y < 0.1f) //back
        {
            cam.transform.position -= new Vector3(0, 0,
                Time.deltaTime * camSpeed);
        }
        if(mousePos.y > 0.9f) //forward
        {
            cam.transform.position += new Vector3(0, 0,
                Time.deltaTime * camSpeed);
        }

        //scroll wheel on mouse for up/down
            cam.transform.position += new Vector3(0,
                Input.mouseScrollDelta.y);
    }

    //methods to increment counts
    public void Zone1()
    {
        zone1++;
        countText.text = "Platform 1: " + zone1 +
           "\tPlatform 2: " + zone2;
    }

    public void Zone2()
    {
        zone2++;
        countText.text = "Platform 1: " + zone1 +
           "\tPlatform 2: " + zone2;
    }

    public void Spawn()
    {
        //randomly spawn balls at starting positions
        for (int i = 0; i < 50; i++)
        {
            float xPos = Random.Range(-3f, 5f);
            float yPos = Random.Range(0f, 8f);
            float zPos = Random.Range(-7f, 7f);

            Instantiate(ballPrefab, new Vector3(xPos, yPos, zPos),
                Quaternion.identity);
        }
    }

    //coroutine to count the timer down
    IEnumerator Countdown()
    {
        //while the timer is above 0 count down
        yield return new WaitForSeconds(1);
        while (time > 0)
        {
            
            time--;
            timeText.text = "Time: " + time;
            yield return new WaitForSeconds(1);
        } 
    }

    //coroutine to declare a winner
    IEnumerator EndGame()
    {
        //wait until time is done or 100 hits happen
        yield return new WaitUntil(() => time == 0 ||
        zone1 + zone2 >= 100);
        //set time 0, declare winner
        time = 1;
        if (zone1 > zone2) timeText.text = "P1 Wins";
        else if (zone2 > zone1) timeText.text = "P2 Wins";
        else timeText.text = "TIE";
    }
}
