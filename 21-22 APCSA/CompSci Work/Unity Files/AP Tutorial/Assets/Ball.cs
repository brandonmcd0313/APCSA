using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Ball : MonoBehaviour {

    AudioSource aud;
    public AudioClip hitSound;

	// Use this for initialization
	void Start () {
		aud = GetComponent<AudioSource>(); //hook up aud
	}
	
	// Update is called once per frame
	void Update () {
		
	}

    //method that runs when we hit something
    private void OnCollisionEnter(Collision other)
    {
        //if we hit a landing zone
        if(other.gameObject.tag == "Landing")
        {
            //randomize the color of the platform
            other.gameObject.GetComponent<MeshRenderer>().material.
                color = new Color(Random.Range(0, 1f),
                Random.Range(0, 1f), Random.Range(0, 1f));

            //play sound effect
            aud.PlayOneShot(hitSound);

            //call apropriate method from world manager
            if (other.gameObject.name == "zone1")
            {
                GameObject.Find("World Manager").
                    GetComponent<WorldManager>().Zone1();
            }
            if (other.gameObject.name == "zone2")
            {
                GameObject.Find("World Manager").
                    GetComponent<WorldManager>().Zone2();
            }
        }
    }
    //runs when hits a trigger zone
    void OnTriggerEnter(Collider other)
    {
        if(other.tag == "Fall Zone")
        {
            Destroy(gameObject); //ks
        }
    }
}
