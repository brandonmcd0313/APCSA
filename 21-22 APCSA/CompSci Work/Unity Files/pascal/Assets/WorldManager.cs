using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class WorldManager : MonoBehaviour {

    //min & max camera positions
    float minX, maxX, minZ, maxZ;
    float camSpeed = 10f;
    public GameObject ballPrefab;
    float[] zones = new float[9];
    public TextMesh[] countText = new TextMesh[9];
    public Text ballTotal; float balls = 0;

	// Use this for initialization
	void Start () {
        Screen.SetResolution(1024,768,false);

        Spawn();
        ballTotal.text = "Total Balls Spawned : " + balls;
        //initiallize count text array
        for (int i = 0; i < 9; i++)
        {
            countText[i].text = "" + zones[i]
                + "\n" + ((Mathf.Round(zones[i]/balls)*100)/100)
                + "%";
        }
       // countText.text = "Platform 1: " + zone1 +
          //  "\tPlatform 2:" + zone2;
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
    public void zoneHit(int zone)
    {
        zones[zone-1]++;
        countText[zone-1].text = "" + zones[zone - 1]
                + "\n" + 
                ((Mathf.Round((zones[zone - 1] / balls) * 10000) / 100)
                + "%");
    }
    

    public void Spawn()
    {

        //randomly spawn balls at starting positions
        
        for (int i = 0; i < 50; i++)
        {
            float xPos = Random.Range(-23.5f, 23.5f);
            float yPos = Random.Range(45f, 50f);
            float zPos = Random.Range(-1.2f, -2.5f);

            Instantiate(ballPrefab, new Vector3(xPos, yPos, zPos),
                Quaternion.identity);
            balls++;
        }

        ballTotal.text = "Total Balls Spawned : " + balls;
    }

    public void increaseBall()
    {
        balls++;
        ballTotal.text = "Total Balls Spawned : " + balls;
    }

   
}
